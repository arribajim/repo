package gmx.ambit.data;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name="gambit_results")
public class GambitResult {

	@Id
	@Column(name="nodeid")
	private BigInteger NodeId;
	@NotNull
	@Column(name="name")
	private String Name;
	
	
	private Date createTime;
	
	@PrePersist
	  void createTime() {
	    this.createTime = new Date();
	  }
	
	@Column(name="odd")
	private Number odd;
	
	@Column(name="priority")
	private Integer Priority;
	
	@Column(name="locked")
	private Boolean Locked;
		
	@Column(name="parentnodeid")
	private Integer parentnodeid;
	
	
}
