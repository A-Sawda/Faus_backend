package com.asawda.faus.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Table(name = "Employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEmployee;
	private String sexEmployee;
	private LocalDate brithdayEmployee;
	private String firstNameEmployee;
	private String lastNameEmployee;
	private String fullNameEmployee;
	private Double salaryEmployee;
	private LocalDate hiringDateEmployee;
	@ManyToOne
	//@Column(name = "id_job")
	private Job job;

	public Employee(String sexeEmployee, LocalDate brithdayEmployee, String firstNameEmployee, String lastNameEmployee,
			String fullNameEmployee, Double salaryEmployee, LocalDate hiringDateEmployee, Job job) {
		super();
		this.sexEmployee = sexeEmployee;
		this.brithdayEmployee = brithdayEmployee;
		this.firstNameEmployee = firstNameEmployee;
		this.lastNameEmployee = lastNameEmployee;
		this.fullNameEmployee = fullNameEmployee;
		this.salaryEmployee = salaryEmployee;
		this.hiringDateEmployee = hiringDateEmployee;
		this.job = job;
	}
	
	/*@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name="USER_ID")
    private User author;

    @Enumerated(EnumType.STRING)    
    private Tag topicTag;

    private String name;
    private String text;

    @OneToMany(mappedBy = "topic", cascade = CascadeType.ALL)
    private Collection<Comment> comments = new LinkedHashSet<Comment>();*/

}
