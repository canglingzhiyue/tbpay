package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.update.result.BundleUpdateStep;

/* loaded from: classes.dex */
public interface rfz {

    /* loaded from: classes9.dex */
    public interface a {
        void hasPatched(boolean z);

        void patchFailed(String str);

        void patchStart();

        void patchSuccess();

        void patching(BundleUpdateStep bundleUpdateStep);
    }

    void onUpdate(boolean z, JSONObject jSONObject, String str);

    void patchProcessListener(a aVar);
}
