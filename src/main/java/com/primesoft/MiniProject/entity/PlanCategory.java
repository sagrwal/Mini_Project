package com.primesoft.MiniProject.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data // use to generate setter and getter automatically with the help of lombok
		// dependency
@Table(name = "PLAN_CATEGORY")
public class PlanCategory {

	@Id
	@GeneratedValue
	@Column(name = "CATEGORY_ID")
	private Integer categoryId;

	@Column(name = "CATEGORY_NAME")
	private String categoryName;

	@Column(name = "ACTIVE_SW")
	private String activeSw;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

	@Column(name = "CREATED_DATE", updatable = false)
	@CreationTimestamp
	private LocalDate createDate;

	@Column(name = "UPDATED_DATE", insertable = false)
	@UpdateTimestamp
	private LocalDate updateDate;

	public Integer getCategoryId() {
		return categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

}
