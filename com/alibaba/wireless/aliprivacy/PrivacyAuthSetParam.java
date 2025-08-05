package com.alibaba.wireless.aliprivacy;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class PrivacyAuthSetParam implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final List<PrivacyAuthParam> privacyAuthResultList;

    private PrivacyAuthSetParam() {
        this(new a());
    }

    public PrivacyAuthSetParam(a aVar) {
        this.privacyAuthResultList = a.a(aVar);
    }

    public List<PrivacyAuthParam> getAuthSetParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1c788296", new Object[]{this}) : this.privacyAuthResultList;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final List<PrivacyAuthParam> f4232a = new ArrayList();

        public static /* synthetic */ List a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("412cc591", new Object[]{aVar}) : aVar.f4232a;
        }

        public a a(String str, Map<String, Boolean> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("250a3421", new Object[]{this, str, map});
            }
            PrivacyAuthParam privacyAuthParam = new PrivacyAuthParam();
            privacyAuthParam.setSceneCode(str);
            privacyAuthParam.setPermissions(map);
            this.f4232a.add(privacyAuthParam);
            return this;
        }

        public PrivacyAuthSetParam a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PrivacyAuthSetParam) ipChange.ipc$dispatch("5df07cd3", new Object[]{this}) : new PrivacyAuthSetParam(this);
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f4232a.isEmpty();
        }
    }
}
