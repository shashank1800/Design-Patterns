package org.example.b_structural_pattern.d_proxy;

public class ProxyService implements ServiceInterface {

    DatabaseService service;

    ProxyService(DatabaseService service) {
        this.service = service;
    }

    @Override
    public void operation() {

        if (!checkAccess())
            throw new RuntimeException("No access");

        service.operation();
    }

    private boolean checkAccess() {
        boolean hasAccess = true; // Check access permission
        if (hasAccess)
            return true;
        else return false;
    }
}
