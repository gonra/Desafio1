package neomind.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "fornecedor")
@XmlRootElement
@NamedQueries({
   @NamedQuery(name = "Fornecedor.findAll", query = "SELECT t FROM Fornecedor t"),
   @NamedQuery(name = "Fornecedor.findById", query = "SELECT t FROM Fornecedor t WHERE t.id = :id")})
public class Fornecedor implements Serializable {
   private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
   private Integer id;
    @Column(name = "name")
   private String name;
    @Column(name = "email")
   private String email;
    @Column(name = "comment")
   private String comment;
    @Column(name = "cnpj")
   private String cnpj;

   public Fornecedor(){
       this.id = -1;
       this.name = "";
       this.email = "";
       this.comment = "";
       this.cnpj = "";
   }

   public Fornecedor(Integer id) {
       this.id = id;
   }

   public Fornecedor(Integer id, String name, String email, String comment, String cnpj){
       this.id = id;
       this.name = name;
       this.email = email;
       this.comment = comment;
       this.cnpj = cnpj;
   }

   public Integer getId() {
       return id;
   }

   public void setId(Integer id) {
       this.id = id;
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getEmail() {
       return email;
   }

   public void setEmail(String email) {
       this.email = email;
   }

   public String getComment() {
       return comment;
   }

   public void setComment(String comment) {
       this.comment = comment;
   }

   public String getCnpj() {
       return cnpj;
   }

   public void setCnpj(String cnpj) {
       this.cnpj = cnpj;
   }

   @Override
   public int hashCode() {
       int hash = 0;
       hash += (id != null ? id.hashCode() : 0);
       return hash;
   }

   @Override
   public boolean equals(Object object) {
       // TODO: Warning - this method won't work in the case the id fields are not set
       if (!(object instanceof Fornecedor)) {
           return false;
       }
       Fornecedor other = (Fornecedor) object;
       if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
           return false;
       }
       return true;
   }

   @Override
   public String toString() {
       return "neomind.Fornecedor[ id=" + id + " ]";
   }

   public String toJson() {
       return "{\"id\":"+ id.toString() +","+
              " \"name\":\""+ name +"\","+
              " \"email\":\""+ email +"\","+
              " \"comment\":\""+this.comment+"\","+
              " \"cnpj\":\""+this.cnpj+"\"}";
   }

   public void copy(Fornecedor p1){
       this.name = p1.getName();
       this.email = p1.getEmail();
       this.comment = p1.getComment();
       this.cnpj = p1.getCnpj();
   }

   public void parseJson(String j) {
       String[] st = j.substring(1,j.length()-1).split(",");
       for (String line : st)
       {
           String[] kv = line.split(":");
           if(kv.length < 2) continue;
           String item = kv[0].trim();
           String value = kv[1].trim();
           // Trim 
           item = item.substring(1, item.length()-1);
           
           if(item.equals("id")){
              Integer id = Integer.parseInt(value);
              this.id = id;
           }
           if(item.equals("name")){              
              this.name = value.substring(1, value.length()-1);
           }
           if(item.equals("email")){
              this.email = value.substring(1, value.length()-1);
           }
           if(item.equals("comment")){
              this.comment = value.substring(1, value.length()-1);
           }
           if(item.equals("cnpj")){
              this.cnpj = value.substring(1, value.length()-1);
           }
       }       
    }
}