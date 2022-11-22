package pe.unjfsc.daw.choclotv.choclotv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
// Implementamos la interfaz CommandLineRunner:
public class ChoclotvApplication{

	private static final Logger LOG = LoggerFactory.getLogger(ChoclotvApplication.class);
	//private static org.springframework.context.ApplicationContext context;

	// Inyectamos el ObjectMapper, para el mapeo de datos leidos de un archivo con el TypeReference indicado
	@Autowired
	ObjectMapper mapper;

	public static void main(String[] args) {
		LOG.info("INCIO DE APLICACION");
		SpringApplication.run(ChoclotvApplication.class, args);
	}

	// Sobrescribimos el metodo run(se sobrescribe de manera obligatoria):
	/*@Override
	// Cada bean que implemente la interfaz CommandLineRunner, ejecutara el metodo run.
	public void run(String... args) throws Exception {

		LOG.info("EJECUTANDO: CommandLineRunner.");

		// Instanciamos el tipo de referencia para el mappeo del JSON a la data que tengamos en el modelo:
		TypeReference<List<Usuario>> typeReference = new TypeReference<List<Usuario>>() {};

		// Usamos inputStream para la lectura de archivos
		InputStream inputStream = TypeReference.class.getResourceAsStream("/data/usuarios.json");
		LOG.info(String.valueOf(inputStream.markSupported()));

		// Mapeamos lo que obtuvimos en el inputStream al tipo de referencia indicado al inicio:
		List<Usuario> usuarios = mapper.readValue(inputStream, typeReference);
		// Listamos los usuarios:
		usuarios.forEach(usuario -> {
			LOG.info(usuario.toString());
		});

		long timeStart = System.nanoTime();
		// Llamamos al service de usuario, para guardar la lista de usuarios que obtuvimos desde el archivo JSON:
		usuarioService.guardarUsuarios(usuarios);
		long timeEnd = System.nanoTime();
		long duracion = (timeEnd - timeStart) / 1000000;

		LOG.info("Duracion de la transaccion: ".concat(String.valueOf(duracion + "ms.")));
		LOG.info("Usuarios guardados.");
	}*/
}
