package enriquez.damian.proyectofinal;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.proyectofinal.Model.tblUser;
import com.example.proyectofinal.Remote.IMyAPI;
import com.example.proyectofinal.Remote.RetrofitClient;
import com.google.android.material.textfield.TextInputEditText;

import androidx.appcompat.app.AppCompatActivity;

import dmax.dialog.SpotsDialog;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    IMyAPI iMyAPI;
    CompositeDisposable compositeDisposable=new CompositeDisposable();

    EditText edt_user, edt_password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_user = (EditText)findViewById(R.id.edUsername);
        edt_password = (EditText)findViewById(R.id.edPassword);
        btn_login = (Button)findViewById(R.id.btnLogin);
        //
        iMyAPI= RetrofitClient.getInstance().create(IMyAPI.class);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog dialog = new SpotsDialog.Builder()
                        .setContext(MainActivity.this)
                        .build();
                dialog.show();
                tblUser user = new tblUser(edt_user.getText().toString(),
                        edt_password.getText().toString(),"");
                compositeDisposable.add(iMyAPI.loginUser(user)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {
                        Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this,throwable.getMessage(),Toast.LENGTH_SHORT).show();

                    }
                }));

            }
        });


    }

    @Override
    protected void onStop() {
        compositeDisposable.clear();
        super.onStop();

    }
}

