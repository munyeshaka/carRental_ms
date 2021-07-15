
package Model.Bean;


 
public class ReservationBean {
    private String customer, category, pick_up_date;
    private String return_date, discount_amount, transaction_amount;

public ReservationBean() {

}

    public String getCustomer() {
        return customer;
    }

    public String getCategory() {
        return category;
    }

    public String getPick_up_date() {
        return pick_up_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public String getDiscount_amount() {
        return discount_amount;
    }

    public String getTransaction_amount() {
        return transaction_amount;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPick_up_date(String pick_up_date) {
        this.pick_up_date = pick_up_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public void setDiscount_amount(String discount_amount) {
        this.discount_amount = discount_amount;
    }

    public void setTransaction_amount(String transaction_amount) {
        this.transaction_amount = transaction_amount;
    }
}