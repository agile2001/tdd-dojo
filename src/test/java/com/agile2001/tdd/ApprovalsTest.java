package com.agile2001.tdd;

import org.approvaltests.Approvals;
import org.approvaltests.JsonApprovals;
import org.junit.jupiter.api.Test;

public class ApprovalsTest {

    @Test
    void verify() throws Exception {
        Approvals.verify("hello");
    }
    //    @Test
    //    void verifyJson() throws Exception {
    //        JsonApprovals.verifyJson("{}");
    //    }
}
