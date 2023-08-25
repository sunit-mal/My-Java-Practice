import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Script_to_run {
    public static void main(String[] args) {
        String[] scripts = {
                "NOC_MassagePassing_Problem",
                "NOC_MassagePassing_Problem_SRB_DLT",
        };

        for (String script : scripts) {
            runScriptAndStoreOutput(script);
        }
    }

    public static void runScriptAndStoreOutput(String script) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("java", script);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();

            // Read the output of the command
            InputStream inputStream = process.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            // Store the output in a file
            StringBuilder outputBuilder = new StringBuilder();
            String output;
            while ((output = bufferedReader.readLine()) != null) {
                outputBuilder.append(output).append("\n");
            }

            // Write the output to a file
            String filename = "output.txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
                writer.write(outputBuilder.toString());
            }

            // Close the resources
            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
