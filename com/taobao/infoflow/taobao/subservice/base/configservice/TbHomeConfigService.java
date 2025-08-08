package com.taobao.infoflow.taobao.subservice.base.configservice;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;
import com.taobao.infoflow.protocol.subservice.base.IConfigService;
import tb.kge;
import tb.ldf;
import tb.ldj;
import tb.ljs;
import tb.lwx;

/* loaded from: classes.dex */
public class TbHomeConfigService implements IConfigService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_GROUP_NAME = "homepage_switch";
    private static final String TAG = "TbHomeConfigService";

    static {
        kge.a(1527292709);
        kge.a(-751233019);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IConfigService
    public String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        if (StringUtils.equals(str, "homepage_switch")) {
            return ldj.a(str2, str3);
        }
        try {
            String a2 = lwx.a(str, str2, str3);
            ldf.a(TAG, "groupName : " + str + " key: " + str2 + "=" + a2);
            return a2;
        } catch (InfoFlowRuntimeException e) {
            e.printStackTrace();
            return str3;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IConfigService
    public String getString(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2}) : getConfig("homepage_switch", str, str2);
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IConfigService
    public int getIntValue(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d64674d", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(getConfig("homepage_switch", str, i + ""));
        } catch (InfoFlowRuntimeException unused) {
            return i;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IConfigService
    public boolean getBooleanValue(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("221a66e8", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        String config = getConfig("homepage_switch", str, z + "");
        return StringUtils.isEmpty(config) ? z : Boolean.parseBoolean(config);
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IConfigService
    public float getFloatValue(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("341be674", new Object[]{this, str, new Float(f)})).floatValue();
        }
        try {
            return Float.parseFloat(getConfig("homepage_switch", str, f + ""));
        } catch (InfoFlowRuntimeException unused) {
            return f;
        }
    }
}
