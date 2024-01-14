package org.example.b_structural_pattern.d_proxy;

import org.example.util.CommonUtils;

public class DatabaseService implements ServiceInterface {

    @Override
    public void operation() {
        CommonUtils.display("Operation");
    }
}
