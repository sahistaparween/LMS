package com.hexaware.loanmanagementsystem.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanDetails {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="loan_id")
public Long loan_id;

@Column(name="loan_status")
public String loan_status;

@Column(name="loan_term")
public Long loan_term;

@Column(name="loan_date")
public Long loan_date;


@Column(name="loan_amount")
public Long loan_amount;


@Column(name="loan_type")
public String loan_type;




public  LoanDetails() {
// TODO Auto-generated constructor stub
}
public Long getLoan_id() {
return loan_id;
}

        public void setLoan_id(Long loan_id) {
this.loan_id = loan_id;
}
        public String getLoan_status() {
return loan_status;
}

      public void setLoan_status(String loan_status) {
this.loan_status = loan_status;
}
         public Long getLoan_term() {
return loan_term;
}

         public void setLoan_term(Long loan_term) {
this.loan_term = loan_term;
}

         public Long getLoan_date() {
return loan_date;
}
         
         public void setLoan_date(Long loan_date) {
this.loan_date = loan_date;
         }

public Long getLoan_amount() {
return loan_amount;
}

          public void setLoan_amount(Long loan_amount) {
this.loan_amount = loan_amount;
}


          public String getLoan_type() {
return loan_type;
}

          public void setLoan_type(String loan_type) {
this.loan_type = loan_type;
}



public LoanDetails(Long loan_id, String loan_status, Long loan_amount, Long loan_term,
Long loan_date, String loan_type )

       {
super();
this.loan_id = loan_id;
this.loan_status = loan_status;
this.loan_amount = loan_amount;
this.loan_term = loan_term;
this.loan_date = loan_date;
this.loan_type = loan_type;

}

@Override
public String toString() {
return "LoanDetails [loan_id=" + loan_id + ", loan_status=" + loan_status + ", loan_amount="
+ loan_amount + ",loan_term =" + loan_term + ",loan_date =" + loan_date
+ ", loan_type=" + loan_type + "]";}
}
