package Elevator;

public class ElevatorSolutions{
//fields
    private int maxWeight;
    private int currentFloor = 0;
    private char[] floors = {'G', '1', '2', '3', '4', '5', '6'};

//constructor
    public ElevatorSolutions(int maxWeight){
        this.maxWeight = maxWeight;
    }

    //instance methods
    public void upOneFloor(){
        if(currentFloor == floors.length-1){
            System.out.println("Already on Max Floor");
            return;
        }   

        currentFloor++;

    }

    public void downOneFloor(){
        if(currentFloor == 0){
            System.out.println("Already on Lowest Floor");
            return;
        }
        currentFloor--;
    }

    public char getFloor(){
        return floors[currentFloor];
    }

}