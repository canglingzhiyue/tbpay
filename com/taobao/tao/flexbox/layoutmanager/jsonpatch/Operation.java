package com.taobao.tao.flexbox.layoutmanager.jsonpatch;

import com.taobao.weex.ui.view.gesture.WXGesture;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
enum Operation {
    ADD("add"),
    REMOVE("remove"),
    REPLACE("replace"),
    MOVE(WXGesture.MOVE),
    COPY("copy"),
    TEST("test");
    
    private static final Map<String, Operation> OPS;
    private String rfcName;

    static {
        HashMap hashMap = new HashMap();
        OPS = hashMap;
        Operation operation = ADD;
        hashMap.put(operation.rfcName, operation);
        Map<String, Operation> map = OPS;
        Operation operation2 = REMOVE;
        map.put(operation2.rfcName, operation2);
        Map<String, Operation> map2 = OPS;
        Operation operation3 = REPLACE;
        map2.put(operation3.rfcName, operation3);
        Map<String, Operation> map3 = OPS;
        Operation operation4 = MOVE;
        map3.put(operation4.rfcName, operation4);
        Map<String, Operation> map4 = OPS;
        Operation operation5 = COPY;
        map4.put(operation5.rfcName, operation5);
        Map<String, Operation> map5 = OPS;
        Operation operation6 = TEST;
        map5.put(operation6.rfcName, operation6);
    }

    Operation(String str) {
        this.rfcName = str;
    }

    public static Operation fromRfcName(String str) throws InvalidJsonPatchException {
        if (str != null) {
            Operation operation = OPS.get(str.toLowerCase());
            if (operation != null) {
                return operation;
            }
            throw new InvalidJsonPatchException("unknown / unsupported operation " + str);
        }
        throw new InvalidJsonPatchException("rfcName cannot be null");
    }

    public String rfcName() {
        return this.rfcName;
    }
}
