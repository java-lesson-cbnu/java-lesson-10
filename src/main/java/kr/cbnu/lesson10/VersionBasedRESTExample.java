package kr.cbnu.lesson10;

import kr.cbnu.lesson10.dto.TestDto;
import kr.cbnu.lesson10.model.TestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 해당 문제는 MVC 패턴을 통해 간단한 REST를 버전을 분리해 구현해보는 예제입니다.
 * <p>
 * 해당 문제는 다음과 같은 제한사항을 가집니다 :
 * - test는 TestService를 이용하여 DTO를 반환해야 합니다.
 * - API가 정상 작동일 경우 OK(200), 비정상 작동일 경우 INTERNAL_SERVER_ERROR(500)을 반환해야 합니다.
 * - toggleStatus는 {@link TestService#toggleApi()}를 사용하여 API 활성화 여부를 설정해야 합니다.
 */
@RequestMapping("/rest/v2")
@RestController
public class VersionBasedRESTExample {
    private TestService service;

    public VersionBasedRESTExample(TestService service) {
        this.service = service;
    }

    @GetMapping("/status/toggle/")
    public ResponseEntity<Boolean> toggleStatus() {
        throw new RuntimeException("이곳에서 코드를 구현하십시오.");
    }

    @GetMapping("/visit")
    public ResponseEntity<TestDto> test() {
        throw new RuntimeException("이곳에서 코드를 구현하십시오.");
    }
}
