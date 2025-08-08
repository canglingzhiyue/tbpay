package com.alibaba.wireless.aliprivacyext.jsbridge.api;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;

@com.alibaba.wireless.aliprivacyext.jsbridge.c(name = {"setAuthStatus"})
/* loaded from: classes3.dex */
public class i extends com.alibaba.wireless.aliprivacyext.jsbridge.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public static class a implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int status;
        private String type;

        private a() {
        }

        public int getStatus() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue() : this.status;
        }

        public String getType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.type;
        }

        public void setStatus(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("384790e8", new Object[]{this, new Integer(i)});
            } else {
                this.status = i;
            }
        }

        public void setType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
            } else {
                this.type = str;
            }
        }
    }

    @Override // com.alibaba.wireless.aliprivacyext.jsbridge.a
    public boolean a(Context context, String str, String str2, com.alibaba.wireless.aliprivacyext.plugins.b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b709cffc", new Object[]{this, context, str, str2, bVar})).booleanValue();
        }
        if (StringUtils.isEmpty(str2)) {
            b(bVar, "参数异常", null);
            return true;
        }
        a aVar = (a) com.alibaba.wireless.aliprivacyext.f.a(str2, a.class);
        if (aVar == null || !"pasteboard".equals(aVar.getType())) {
            b(bVar, "参数异常", null);
            return true;
        }
        HashMap hashMap = new HashMap();
        if (aVar.getStatus() == 1) {
            z = true;
        }
        hashMap.put("status", Integer.valueOf(com.alibaba.wireless.aliprivacy.b.a(z) ? 1 : -1));
        a(bVar, "调用成功", hashMap);
        return true;
    }
}
