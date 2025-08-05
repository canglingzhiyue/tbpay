package com.xiaomi.push;

import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes9.dex */
public class gk {

    /* renamed from: a  reason: collision with root package name */
    private XmlPullParser f24502a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gk() {
        try {
            this.f24502a = XmlPullParserFactory.newInstance().newPullParser();
            this.f24502a.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        } catch (XmlPullParserException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public hh a(byte[] bArr, gq gqVar) {
        this.f24502a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
        this.f24502a.next();
        int eventType = this.f24502a.getEventType();
        String name = this.f24502a.getName();
        if (eventType == 2) {
            if (name.equals("message")) {
                return hp.a(this.f24502a);
            }
            if (name.equals("iq")) {
                return hp.a(this.f24502a, gqVar);
            }
            if (name.equals("presence")) {
                return hp.m2015a(this.f24502a);
            }
            if (this.f24502a.getName().equals("stream")) {
                return null;
            }
            if (this.f24502a.getName().equals("error")) {
                throw new hb(hp.m2016a(this.f24502a));
            }
            if (!this.f24502a.getName().equals(BaseFBPlugin.PWD_TIPS_TYPE.typeWarning)) {
                this.f24502a.getName().equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_bind);
                return null;
            }
            this.f24502a.next();
            this.f24502a.getName().equals("multi-login");
            return null;
        }
        return null;
    }
}
