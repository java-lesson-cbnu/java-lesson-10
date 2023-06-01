package kr.cbnu.lesson10.model;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    private boolean enableApi = true;

    private int visitCount = 0;

    public void toggleApi() {
        enableApi = !enableApi;
    }

    public boolean isApiEndpointEnabled() {
        return enableApi;
    }

    public int getVisitCount(boolean increase) {
        if (!enableApi)
            throw new IllegalStateException();
        return increase ? ++visitCount : visitCount;
    }
}
