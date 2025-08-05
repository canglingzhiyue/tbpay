package com.taobao.phenix.compat;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.mtop.MtopBgForbiddenException;
import com.taobao.phenix.compat.mtop.MtopCertificateException;
import com.taobao.phenix.compat.mtop.MtopConnectException;
import com.taobao.phenix.compat.mtop.MtopConnectTimeoutException;
import com.taobao.phenix.compat.mtop.MtopIOException;
import com.taobao.phenix.compat.mtop.MtopIndifferentException;
import com.taobao.phenix.compat.mtop.MtopInvalidHostException;
import com.taobao.phenix.compat.mtop.MtopInvalidUrlException;
import com.taobao.phenix.compat.mtop.MtopReadTimeoutException;
import com.taobao.phenix.compat.mtop.MtopRequestCancelException;
import com.taobao.phenix.compat.mtop.b;

/* loaded from: classes.dex */
public class h implements com.taobao.phenix.compat.stat.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.phenix.compat.stat.c
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : b.MTOP_EXTRA_HIT_CDN_CACHE;
    }

    @Override // com.taobao.phenix.compat.stat.c
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : b.MTOP_EXTRA_CONNECT_TYPE;
    }

    @Override // com.taobao.phenix.compat.stat.c
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : b.MTOP_EXTRA_CDN_IP_PORT;
    }

    @Override // com.taobao.phenix.compat.stat.c
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : b.MTOP_EXTRA_FIRST_DATA;
    }

    @Override // com.taobao.phenix.compat.stat.c
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : b.MTOP_EXTRA_SEND_BEFORE;
    }

    @Override // com.taobao.phenix.compat.stat.c
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : b.MTOP_EXTRA_RESPONSE_CODE;
    }

    @Override // com.taobao.phenix.compat.stat.c
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : b.MTOP_EXTRA_SERVER_RT;
    }

    @Override // com.taobao.phenix.compat.stat.c
    public boolean a(Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb9ad891", new Object[]{this, th})).booleanValue() : (th instanceof MtopIndifferentException) && ((MtopIndifferentException) th).getExtraCode() == -200;
    }

    @Override // com.taobao.phenix.compat.stat.c
    public boolean b(Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fd742bb0", new Object[]{this, th})).booleanValue() : th instanceof MtopReadTimeoutException;
    }

    @Override // com.taobao.phenix.compat.stat.c
    public boolean c(Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff4d7ecf", new Object[]{this, th})).booleanValue() : th instanceof MtopCertificateException;
    }

    @Override // com.taobao.phenix.compat.stat.c
    public boolean d(Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("126d1ee", new Object[]{this, th})).booleanValue() : th instanceof MtopInvalidHostException;
    }

    @Override // com.taobao.phenix.compat.stat.c
    public boolean e(Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("300250d", new Object[]{this, th})).booleanValue() : th instanceof MtopConnectTimeoutException;
    }

    @Override // com.taobao.phenix.compat.stat.c
    public boolean f(Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d9782c", new Object[]{this, th})).booleanValue() : th instanceof MtopInvalidUrlException;
    }

    @Override // com.taobao.phenix.compat.stat.c
    public boolean g(Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b2cb4b", new Object[]{this, th})).booleanValue() : th instanceof MtopIndifferentException;
    }

    @Override // com.taobao.phenix.compat.stat.c
    public boolean h(Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88c1e6a", new Object[]{this, th})).booleanValue() : th instanceof MtopBgForbiddenException;
    }

    @Override // com.taobao.phenix.compat.stat.c
    public boolean i(Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a657189", new Object[]{this, th})).booleanValue() : th instanceof MtopRequestCancelException;
    }

    @Override // com.taobao.phenix.compat.stat.c
    public boolean j(Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c3ec4a8", new Object[]{this, th})).booleanValue() : th instanceof MtopConnectException;
    }

    @Override // com.taobao.phenix.compat.stat.c
    public boolean k(Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e1817c7", new Object[]{this, th})).booleanValue() : th instanceof MtopIOException;
    }
}
