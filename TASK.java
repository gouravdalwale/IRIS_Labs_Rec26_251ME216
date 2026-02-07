import java.io.*;
import java.util.*;

class TASK {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new FileReader("odysseyall.txt.txt"));
        StringBuilder text = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            text.append(line).append("\n");
        }
        br.close();

        String[] chunks = text.toString().split("\\n\\n");
        if (chunks.length < 50) {
            chunks = text.toString().split("\\n");
        }

        System.out.println("Enter your question:");
        String question = sc.nextLine().toLowerCase();
        String[] keywords = question.split(" ");

        int maxScore = 0;
        int chunkIndex = 0;
        int bestIndex = -1;
        String bestAnswer = "Answer not found";

        for (String chunk : chunks) {
            int score = 0;
            String lowerChunk = chunk.toLowerCase();

            for (String word : keywords) {
                if (word.length() < 4) continue;
                if (word.equals("odyssey")) continue;

                if (lowerChunk.contains(word)) {
                    score++;
                }
            }

            if (score > maxScore) {
                maxScore = score;
                bestAnswer = chunk;
                bestIndex = chunkIndex;
            }

            chunkIndex++;
        }

        if (bestIndex != -1) {
            System.out.println("Answer found in chunk ID: " + bestIndex);
            System.out.println("\nANSWER IS:\n" + bestAnswer);
        } else {
            System.out.println("Answer not found");
        }
    }
}