package _model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StorageHistory")
public class StorageHistoryBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer storageHistoryId;
	private Integer sRequestId;
	private Integer materialsId;
	private double unitPrice;
	private double quantity;
	private double remainingQuantity;
	private String stockTime;
	private String expiryTime;
	private String unit;
	
	public StorageHistoryBean() {}
	
	public StorageHistoryBean(Integer sRequestId, Integer materialsId, double unitPrice, double quantity,
			double remainingQuantity, String stockTime, String expiryTime, String unit) {
		this.sRequestId = sRequestId;
		this.materialsId = materialsId;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.remainingQuantity = remainingQuantity;
		this.stockTime = stockTime;
		this.expiryTime = expiryTime;
		this.unit = unit;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getStorageHistoryId() {
		return storageHistoryId;
	}

	public void setStorageHistoryId(Integer storageHistoryId) {
		this.storageHistoryId = storageHistoryId;
	}

	public Integer getsRequestId() {
		return sRequestId;
	}

	public void setsRequestId(Integer sRequestId) {
		this.sRequestId = sRequestId;
	}

	public Integer getMaterialsId() {
		return materialsId;
	}

	public void setMaterialsId(Integer materialsId) {
		this.materialsId = materialsId;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getRemainingQuantity() {
		return remainingQuantity;
	}

	public void setRemainingQuantity(double remainingQuantity) {
		this.remainingQuantity = remainingQuantity;
	}
	@Column(name="stockTime", columnDefinition="datetime")
	public String getStockTime() {
		return stockTime;
	}

	public void setStockTime(String stockTime) {
		this.stockTime = stockTime;
	}
	@Column(name="expiryTime", columnDefinition="datetime")
	public String getExpiryTime() {
		return expiryTime;
	}

	public void setExpiryTime(String expiryTime) {
		this.expiryTime = expiryTime;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	
}
