package arquivos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class EscreveJSON {

	public static void main(String[] args) throws IOException {

		Usuario usuario1 = new Usuario();
		
		usuario1.setCpf("5895889898");
		usuario1.setLogin("jaoao");
		usuario1.setSenha("5655655");
		usuario1.setNome("alex fernando");
		
		Usuario usuario2 = new Usuario();
		usuario2.setCpf("878979797");
		usuario2.setLogin("a5s45a64s");
		usuario2.setSenha("565sd6d5s6d");
		usuario2.setNome("João sa Silva");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String jsonUser = gson.toJson(usuarios);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter = new FileWriter("C:\\Users\\Alex\\git\\repository\\primeiro-programa-java\\src\\arquivos\\filjson.json");
		
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
		//--------------------------LENDO O ARQUIVO JSON --------------------------------
		
		FileReader fileReader = new FileReader("C:\\Users\\Alex\\git\\repository\\primeiro-programa-java\\src\\arquivos\\filjson.json");
		
		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);
		
		List<Usuario> listUsuarios = new ArrayList<Usuario>();
		
		for (JsonElement jsonElement : jsonArray) {
			Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
			listUsuarios.add(usuario);
		}
		
		System.out.println("Leitura do arquivo JSON: " + listUsuarios);
		
	}

}
