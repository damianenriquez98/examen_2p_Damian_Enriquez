package enriquez.damian.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class ActivityMenuPrincipal extends AppCompatActivity {

    //Cliente cliente = new Cliente();
    //Producto producto = new Producto();
    //Concepto concepto = new Concepto();
    //Usuario usuario = new Usuario();
    //Venta venta = new Venta();

    private ListView listViewDatos;

    // PARA CONSUMIR LAS APIS ME BASÉ EN EL ESTE VIDEO : https://www.youtube.com/watch?v=u0Rbi69ZA0U

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        listViewDatos = findViewById(R.id.ListViewDatos);

        ObtenerDatosClientes();
        ObtenerDatosUsuarios();
        ObtenerDatosConceptos();
        ObtenerDatosProductos();
        ObtenerDatosVentas();
    }

    public void MostrarClientesOnClic(View view){
        ObtenerDatosClientes();
    }
    public void MostrarUsuariosOnClic(View view){
        ObtenerDatosUsuarios();
    }
    public void MostrarProductosOnClic(View view){
        ObtenerDatosProductos();
    }
    public void MostrarVentasOnClic(View view){
        ObtenerDatosVentas();
    }
    public void MostrarConceptosOnClic(View view){
        ObtenerDatosConceptos();
    }

    //METODOS PARA OBTENER DATOS

    public void ObtenerDatosUsuarios(){
        //PonerLinkApiUsuarios
        String link = "";

        //Para permitir que la solicitud al servidor se cumpla
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        URL url = null;
        HttpURLConnection conn;

        try {
            url = new URL(link);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            String json ="";

            while((inputLine=in.readLine()) != null){
                //Permitimos que el Buffered reader traiga los datos con conn.getInputStream
                response.append(inputLine);
            }

            json = response.toString();
            JSONArray jsonArr = null;

            jsonArr =new JSONArray(json);

            ArrayList<String>ListaUsuarrios = new ArrayList<String>();

            String usuario = "";
            for(int i= 0;i<jsonArr.length();i++){
                JSONObject jsonObject = jsonArr.getJSONObject(i);

                //Para probar que traiga los datos, con los campos de cliente o cualquier entidad
                //El primero (ID) sería el nombre que le daremos al campo, lo segundo (id) el dato traido de la base de datos
                Log.d("ID", jsonObject.optString("Id"));

                ListaUsuarrios.add(usuario + "NOMBRE USUARIO" + jsonObject.optString("nombreUsuario"));

                //Falta Mostrar la ListaIdUsuarios al ListView

            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(JSONException e){
            e.printStackTrace();
        }

    }

    public void ObtenerDatosProductos(){
        //PonerLinkApiProductos
        String link = "";

        //Para permitir que la solicitud al servidor se cumpla
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        URL url = null;
        HttpURLConnection conn;

        try {
            url = new URL(link);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            String json ="";

            while((inputLine=in.readLine()) != null){
                //Permitimos que el Buffered reader traiga los datos con conn.getInputStream
                response.append(inputLine);
            }

            json = response.toString();
            JSONArray jsonArr = null;

            jsonArr =new JSONArray(json);

            ArrayList<String>ListaProductos = new ArrayList<String>();
            String producto = "";
            for(int i= 0;i<jsonArr.length();i++){
                JSONObject jsonObject = jsonArr.getJSONObject(i);

                //Para probar que traiga los datos, con los campos de cliente o cualquier entidad
                //El primero (ID) sería el nombre que le daremos al campo, lo segundo (id) el dato traido de la base de datos
                Log.d("ID", jsonObject.optString("Id"));

                ListaProductos.add(producto + "NOMBRE PRODUCTO" + jsonObject.optString("nombre"));

                //Falta Mostrar la ListaIdUsuarios al ListView

            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(JSONException e){
            e.printStackTrace();
        }

    }
    public void ObtenerDatosVentas(){
        //PonerLinkApiVentas
        String link = "";

        //Para permitir que la solicitud al servidor se cumpla
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        URL url = null;
        HttpURLConnection conn;

        try {
            url = new URL(link);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            String json ="";

            while((inputLine=in.readLine()) != null){
                //Permitimos que el Buffered reader traiga los datos con conn.getInputStream
                response.append(inputLine);
            }

            json = response.toString();
            JSONArray jsonArr = null;

            jsonArr =new JSONArray(json);

            ArrayList<String>ListaEstadosVenta = new ArrayList<String>();
            String estado= "";
            for(int i= 0;i<jsonArr.length();i++){
                JSONObject jsonObject = jsonArr.getJSONObject(i);

                //Para probar que traiga los datos, con los campos de cliente o cualquier entidad
                //El primero (ID) sería el nombre que le daremos al campo, lo segundo (id) el dato traido de la base de datos
                Log.d("ID", jsonObject.optString("Id"));

                ListaEstadosVenta.add(estado + "ESTADO VENTA" + jsonObject.optString("estado"));

                //Falta Mostrar la ListaIdVentas al ListView

            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(JSONException e){
            e.printStackTrace();
        }

    }
    public void ObtenerDatosConceptos(){
        //PonerLinkApiConceptos
        String link = "";

        //Para permitir que la solicitud al servidor se cumpla
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        URL url = null;
        HttpURLConnection conn;

        try {
            url = new URL(link);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            String json ="";

            while((inputLine=in.readLine()) != null){
                //Permitimos que el Buffered reader traiga los datos con conn.getInputStream
                response.append(inputLine);
            }

            json = response.toString();
            JSONArray jsonArr = null;

            jsonArr =new JSONArray(json);

            ArrayList<Integer>ListaIdConceptos = new ArrayList<Integer>();
            int concepto =0;

            for(int i= 0;i<jsonArr.length();i++){
                JSONObject jsonObject = jsonArr.getJSONObject(i);

                //Para probar que traiga los datos, con los campos de cliente o cualquier entidad
                //El primero (ID) sería el nombre que le daremos al campo, lo segundo (id) el dato traido de la base de datos
                Log.d("ID", jsonObject.optString("Id"));

                ListaIdConceptos.add(Integer.valueOf(jsonObject.optString("id")));

                //Falta Mostrar la ListaIdConceptos al ListView

            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(JSONException e){
            e.printStackTrace();
        }

    }

    public void ObtenerDatosClientes(){
        //PonerLinkApiClientes
        String link = "https://localhost:44359/api/cliente";

        //Para permitir que la solicitud al servidor se cumpla
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        URL url = null;
        HttpURLConnection conn;

        try {
            url = new URL(link);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            String json ="";

            while((inputLine=in.readLine()) != null){
                //Permitimos que el Buffered reader traiga los datos con conn.getInputStream
                response.append(inputLine);
            }

            json = response.toString();
            JSONArray jsonArr = null;

            jsonArr =new JSONArray(json);

            ArrayList<String>ListaClientes = new ArrayList<String>();
            String cliente = "";
            for(int i= 0;i<jsonArr.length();i++){
                JSONObject jsonObject = jsonArr.getJSONObject(i);

                //Para probar que traiga los datos, con los campos de cliente o cualquier entidad
                //El primero (ID) sería el nombre que le daremos al campo, lo segundo (id) el dato traido de la base de datos
                Log.d("ID", jsonObject.optString("Id"));

                //Log.d("CEDULA", jsonObject.optString("cedula"));
                //Log.d("NOMBRE", jsonObject.optString("nombre"));
                //Log.d("EDAD", jsonObject.optString("edad"));
                //Log.d("TELEFONO", jsonObject.optString("telefono"));
                //Log.d("DIRECCION", jsonObject.optString("direccion"));
                //Log.d("EMAIL", jsonObject.optString("email"));

                ListaClientes.add(cliente + "NOMBRE" + jsonObject.optString("nombre"));

                //Falta Mostrar la ListaClientes al ListView

            }
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,ListaClientes);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(JSONException e){
            e.printStackTrace();
        }

    }
}