package dev.rost.validationframework;

import dev.rost.validationframework.dto.CreateDto;
import dev.rost.validationframework.dto.NestedCreateDto;
import dev.rost.validationframework.dto.NestedUpdateDto;
import dev.rost.validationframework.dto.UpdateDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.Validator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ValidationframeworkApplicationTests {

	@Autowired
	Validator validator;


	@Test
	void updateTest() {
		var valid = UpdateDto.builder()
				.number(3)
				.nested(List.of(
						NestedUpdateDto.builder()
								.flag(false)
								.text("12")
								.build(),
						NestedUpdateDto.builder()
								.flag(true)
								.text("12")
								.build()

				))
				.build();

		assertThat(validator.validate(valid))
				.hasSize(0);
	}


	@Test
	void createTest() {
		var valid = CreateDto.builder()
				.number(3)
				.nested(List.of(
						NestedCreateDto.builder()
								.flag(false)
								.text("12")
								.build(),
						NestedCreateDto.builder()
								.flag(true)
								.text("12")
								.build()

				))
				.build();

		assertThat(validator.validate(valid))
				.hasSize(0);
	}
}
