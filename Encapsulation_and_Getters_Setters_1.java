public class Encapsulation_and_Getters_Setters_1 {
    public static void main(String[] args){
        Amazon customer = new Amazon();
        float payableAmount = customer.Transaction(1000);
        System.out.println("Total Payable "+payableAmount);
    }
}
class Amazon{
    float Transaction(float amt){
        Gpay gpayObj = new Gpay();
        gpayObj.setTxnCharge(0.07f);
        return amt +(amt*gpayObj.getTxnCharge());
    }
}

class Gpay{
    private float txnCharge = 0.05f;
    public void setTxnCharge(float newCharge){
        if(newCharge <= 0.05f){
            System.out.println("Invalid TxnCharhge");
            return;
        }
        txnCharge = newCharge;
    }
    public float getTxnCharge(){
        return txnCharge;
    }
}
