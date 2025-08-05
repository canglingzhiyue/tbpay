package tb;

import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.tbsku.channel.DetailWvPlugin;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class ffi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NO_POSITION = -1;

    static {
        kge.a(1958078282);
        emu.a("com.taobao.android.detail.wrapper.mainpic.DetailWeexMainPicFrameIndexGetter");
    }

    public static int a(Intent intent) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8033c18", new Object[]{intent})).intValue();
        }
        if (intent == null) {
            return -1;
        }
        Serializable serializableExtra = intent.getSerializableExtra(DetailWvPlugin.EXTRA_KEY_ORIGIN_PARAMS_DATA);
        if (!(serializableExtra instanceof JSONObject)) {
            return -1;
        }
        try {
            num = ((JSONObject) serializableExtra).getInteger("frameIndex");
        } catch (Exception e) {
            i.a("DetailWeexMainPicAutoScrollLifecycle#getAutoScrollIndexOfMainPic", e.getMessage());
            num = -1;
        }
        if (num != null && num.intValue() >= 0) {
            return num.intValue();
        }
        return -1;
    }
}
