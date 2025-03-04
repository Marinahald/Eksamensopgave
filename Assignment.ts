const Data_FIlE = 'C:/Users/marin/OneDrive/Dokumenter/GitHub/Eksamensopgave/Assignment.ts';

interface User {
    id: number;
    username: string;
    age: number;
    password: string;
}

// Læs data
async function readData(): Promise<User[]> {
    try {
        const data = await Deno.readTextFile(Data_FIlE);
        return JSON.parse(data) as User[];
    } catch (error) {
        console.error('Fejl ved læsning af datafil:', error);
        return [];
    }
}

// Skriv data
async function writeData(data: User[]) {
    try {
        await Deno.writeTextFile(Data_FIlE, JSON.stringify(data, null, 2));
    } catch (error) {
        console.error('Fejl ved skrivning af datafil:', error);
    }
}

// Eksempel på brug
async function main() {
    const users = await readData();
    console.log(users);
    // Du kan nu bruge dataene som nødvendigt, f.eks. til at tilføje eller opdatere brugere
}

main();
