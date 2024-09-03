package com.teste.medicamento.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class MedicamentoTest {
	private Medicamento medicamento;

	@BeforeEach
	void setUp() {
		//Arrange
		medicamento = new Medicamento(1L,"DorFlex", "Medicamento pra dor", "08/2025");
	}
	@Test
	@DisplayName("Testando o getter e setter do campo Id")
	void testId() {
		//Act
		medicamento.setId(2L);
		//Assert
		assertEquals(2L, medicamento.getId());
	}
	@Test
	@DisplayName("Testando o getter e setter do campo nome")
	void testNome() {
		//Act
		medicamento.setNome("Rivotril");
		//Assert
		assertEquals("Rivotril", medicamento.getNome());
	}
	@Test
	@DisplayName("Testando o getter e setter do campo bula")
	void testBula() {
		//Act
		medicamento.setBula("Remedio para ansiedade");
		//Assert
		assertEquals("Remedio para ansiedade", medicamento.getBula());
	}
	@Test
	@DisplayName("Testando o getter e setter do campo telefone")
	void testValidade() {
		//Act
		medicamento.setDataValidade("07/2024");
		//Assert
		assertEquals("07/2024", medicamento.getDataValidade());
	}
	@Test
	@DisplayName("Testando o construtor com todos os argumentos")
	void testeConstrutorAll() {
		//Act
		Medicamento novoMedicamento = new Medicamento(3L, "Melatonina", "remedio para dormir", "11/2026");
		//Assertion
		assertAll("novoMedicamento",
				()-> assertEquals(3L,novoMedicamento.getId()),
				()-> assertEquals("Melatonina", novoMedicamento.getNome()),
				()-> assertEquals("remedio para dormir",novoMedicamento.getBula()),
				()-> assertEquals("11/2026", novoMedicamento.getDataValidade()));
		
	}

}


