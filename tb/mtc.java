package tb;

import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface mtc {
    void onError(mtj mtjVar, mtk mtkVar);

    void onFinish(mtj mtjVar);

    void onReceiveData(mtj mtjVar, byte[] bArr);

    void onResponse(mtj mtjVar, int i, Map<String, List<String>> map);
}
