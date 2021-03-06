package com.deengao.apr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AmazonProduct")
public class AmazonProduct {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long id;
	
	@Column(name = "TITLE", nullable = false)
	private String productTitle;
	
	@Column(name = "ASIN", nullable = false)
	private String asin;
	
	@Column(name = "CATEGORY", nullable = false)
	private String category;
	
	@Column(name = "RANK", nullable = false)
	private String rank;
	
	@Column(name = "DIMENSIONS", nullable = false)
	private String dimensions;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAsin() {
		return asin;
	}
	
	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}


	public void setAsin(String asin) {
		this.asin = asin;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}
	
	@Override
	public boolean equals(Object o) {
	    if (o == this)
	        return true;
	    if (!(o instanceof AmazonProduct))
	        return false;
	    AmazonProduct other = (AmazonProduct)o;
	    return (asin.equals(other.getAsin()) && productTitle.equals(other.getProductTitle()) && rank.equals(other.getRank()) &&
	    		category.equals(other.getCategory()) && dimensions.equals(other.getDimensions()));
	}
	
	
	@Override
	public final int hashCode() {
	    int result = 17;
	    if (asin != null) {
	        result = 31 * result + asin.hashCode();
	    }
	    if (productTitle != null) {
	        result = 31 * result + productTitle.hashCode();
	    }
	    if (rank != null) {
	        result = 31 * result + rank.hashCode();
	    }
	    if (category != null) {
	        result = 31 * result + category.hashCode();
	    }
	    if (dimensions != null) {
	        result = 31 * result + dimensions.hashCode();
	    }
	    return result;
	}
	
}
