import torch
from transformers import pipeline

print("Loading the AI model... (This may take a minute on the first run)")

# Initialize a text-generation pipeline using a lightweight chat model
# 'device_map="auto"' automatically utilizes your GPU if you have one
generator = pipeline(
    "text-generation", 
    model="meta-llama/Llama-3.2-1B-Instruct", 
    torch_dtype=torch.bfloat16, 
    device_map="auto"
)

# Start a chat history list to maintain the conversation's context
messages = [
    {"role": "system", "content": "You are a helpful, witty, and friendly AI assistant talking in a chat room."}
]

print("\nAI is ready! Type 'quit' or 'exit' to end the chat.\n")

while True:
    # 1. Get input from the user
    user_input = input("You: ")
    
    # Check if the user wants to break the loop
    if user_input.lower() in ['quit', 'exit']:
        print("AI: Goodbye!")
        break
        
    if not user_input.strip():
        continue

    # 2. Append the user's message to the conversation history
    messages.append({"role": "user", "content": user_input})

    # 3. Generate the response
    # max_new_tokens limits how long the AI's reply can be
    outputs = generator(messages, max_new_tokens=150)
    
    # Extract the text reply from the pipeline's structure
    ai_reply = outputs[0]["generated_text"][-1]["content"]

    # 4. Print the response and save it to the history so the AI remembers context
    print(f"AI: {ai_reply}\n")
    messages.append({"role": "assistant", "content": ai_reply})
    