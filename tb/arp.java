package tb;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.datamodel.a;
import com.alibaba.android.aura.datamodel.c;

/* loaded from: classes2.dex */
public interface arp extends ark {
    void afterFlowExecute(c cVar, a aVar, boolean z);

    void afterServiceExecute(c cVar, a aVar, boolean z);

    void beforeFlowExecute(AURAInputData aURAInputData, a aVar);

    void beforeServiceExecute(AURAInputData aURAInputData, a aVar);
}
