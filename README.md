# Retrieval-Based QA System (IRIS Labs Task)

This project implements a simple retrieval-based question answering system in Java.
It reads a text document, splits it into chunks, and finds the most relevant chunk
based on keyword matching with the user’s question.

## Demo Video

Here is the demo video showcasing all the features of the project:

[Click here to watch the demo video](https://drive.google.com/file/d/1CpXJOvC8KIgTy2QXUz1Q-MBIhVRGZlQN/view?usp=drive_link)

## Installation & Run Instructions

1. Clone the repository or download it as a ZIP.
2. Ensure Java (JDK 8 or above) is installed.
3. Place the text file (odysseyall.txt.txt) in the same directory as TASK.java.
4. Compile the program using:
   javac TASK.java
5. Run the program using:
   java TASK
6. Enter a question when prompted to get the most relevant answer from the document.

## Implemented Features

- Reads large text files efficiently using BufferedReader
- Uses StringBuilder for fast text accumulation
- Splits text into chunks for retrieval
- Keyword-based relevance scoring
- Returns the best-matching chunk along with its chunk ID

## Limitations

- Uses basic keyword matching (no semantic embeddings)
- Accuracy depends on keyword overlap
- Does not handle synonyms or paraphrased queries
