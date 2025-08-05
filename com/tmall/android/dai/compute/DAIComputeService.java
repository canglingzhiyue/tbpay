package com.tmall.android.dai.compute;

import com.tmall.android.dai.DAICallback;
import com.tmall.android.dai.model.DAIModelTriggerType;
import com.tmall.android.dai.model.a;
import com.tmall.android.dai.model.j;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public interface DAIComputeService {

    /* loaded from: classes9.dex */
    public enum TaskPriority {
        HIGH(10),
        NORMAL(8),
        LOW(1);
        
        private final int value;

        TaskPriority(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    String a(Map<String, Object> map, String str, String str2, String str3, Map<String, String> map2, Map<String, Map<String, Object>> map3);

    Collection<a> a();

    Map<String, String> a(String str);

    Set<j> a(DAIModelTriggerType dAIModelTriggerType);

    void a(a aVar);

    void a(String str, Map<String, Object> map, TaskPriority taskPriority, DAICallback dAICallback, String str2);

    void b(String str);

    a c(String str);
}
