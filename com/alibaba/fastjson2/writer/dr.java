package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.writer.bg;
import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import tb.cqa;
import tb.dqj;
import tb.dqo;
import tb.dqs;
import tb.dqv;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class dr implements bg {

    /* renamed from: a  reason: collision with root package name */
    static final dr f3096a;

    static {
        kge.a(71859256);
        kge.a(-1047766740);
        f3096a = new dr();
    }

    dr() {
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ FieldWriter a(long j) {
        return bg.CC.$default$a(this, j);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void a(JSONWriter jSONWriter, Object obj) {
        a(jSONWriter, obj, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        String hostName;
        if (obj == null) {
            jSONWriter.n();
            return;
        }
        String name = obj.getClass().getName();
        char c = 65535;
        switch (name.hashCode()) {
            case -2037224663:
                if (name.equals("java.util.regex.Pattern")) {
                    c = 4;
                    break;
                }
                break;
            case 255703211:
                if (name.equals("net.sf.json.JSONNull")) {
                    c = 0;
                    break;
                }
                break;
            case 444521103:
                if (name.equals("java.net.Inet6Address")) {
                    c = 2;
                    break;
                }
                break;
            case 574530702:
                if (name.equals("com.fasterxml.jackson.databind.node.ArrayNode")) {
                    c = 6;
                    break;
                }
                break;
            case 1253867729:
                if (name.equals("java.net.Inet4Address")) {
                    c = 1;
                    break;
                }
                break;
            case 1539653772:
                if (name.equals("java.text.SimpleDateFormat")) {
                    c = 3;
                    break;
                }
                break;
            case 1585284048:
                if (name.equals("java.net.InetSocketAddress")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                jSONWriter.n();
                return;
            case 1:
            case 2:
                hostName = ((InetAddress) obj).getHostName();
                break;
            case 3:
                hostName = ((SimpleDateFormat) obj).toPattern();
                break;
            case 4:
                hostName = ((Pattern) obj).pattern();
                break;
            case 5:
                InetSocketAddress inetSocketAddress = (InetSocketAddress) obj;
                jSONWriter.h();
                jSONWriter.b("address");
                jSONWriter.m();
                jSONWriter.f(inetSocketAddress.getAddress());
                jSONWriter.b("port");
                jSONWriter.m();
                jSONWriter.d(inetSocketAddress.getPort());
                jSONWriter.i();
                return;
            case 6:
                String obj3 = obj.toString();
                if (jSONWriter.a()) {
                    jSONWriter.d(obj3.getBytes(StandardCharsets.UTF_8));
                    return;
                } else {
                    jSONWriter.a(obj3);
                    return;
                }
            default:
                throw new JSONException("not support class : " + name);
        }
        jSONWriter.d(hostName);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void a(cqa cqaVar) {
        bg.CC.$default$a(this, cqaVar);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void a(dqj dqjVar) {
        bg.CC.$default$a((bg) this, dqjVar);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void a(dqo dqoVar) {
        bg.CC.$default$a((bg) this, dqoVar);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void a(dqs dqsVar) {
        bg.CC.$default$a((bg) this, dqsVar);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void a(dqv dqvVar) {
        bg.CC.$default$a((bg) this, dqvVar);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ boolean a(JSONWriter jSONWriter) {
        boolean a2;
        a2 = jSONWriter.a(JSONWriter.Feature.IgnoreNonFieldGetter.mask);
        return a2;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void b(JSONWriter jSONWriter, Object obj) {
        e(jSONWriter, obj, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        a(jSONWriter, obj, obj2, type, j);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ List<FieldWriter> bn_() {
        List<FieldWriter> emptyList;
        emptyList = Collections.emptyList();
        return emptyList;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void c(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        bg.CC.$default$c(this, jSONWriter, obj, obj2, type, j);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void d(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        bg.CC.$default$d(this, jSONWriter, obj, obj2, type, j);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        bg.CC.$default$e(this, jSONWriter, obj, obj2, type, j);
    }
}
