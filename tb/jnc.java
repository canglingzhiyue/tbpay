package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.List;

/* loaded from: classes6.dex */
public interface jnc extends jng {
    void addEventListener(jne jneVar);

    void addTaopaiMissionId(String str);

    JSONObject getCommonParams();

    Context getContext();

    DinamicXEngine getDXEngine();

    jnf getRootComponentContext();

    List<jnd> getRootComponents();

    String getTrackId();

    void setTaopaiTrackInfo(String str, String str2, String str3, String str4);
}
