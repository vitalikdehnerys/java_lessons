package homework_21;

import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface BadCode {
	TypeBadCode type();
	public String key() default"";
}
