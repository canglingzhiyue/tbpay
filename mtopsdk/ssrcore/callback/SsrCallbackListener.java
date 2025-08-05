package mtopsdk.ssrcore.callback;

import java.util.List;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import tb.mtj;

/* loaded from: classes9.dex */
public interface SsrCallbackListener extends MtopListener {
    void onFinish(SsrFinishEvent ssrFinishEvent);

    void onReceiveData(mtj mtjVar, byte[] bArr);

    void onResponse(mtj mtjVar, int i, Map<String, List<String>> map);
}
