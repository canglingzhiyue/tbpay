package com.taobao.monitor.procedure;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes.dex */
public class b implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.monitor.procedure.g
    public g a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("5ccf4590", new Object[]{this, str}) : this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(String str, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("56cd4cf0", new Object[]{this, str, new Long(j)}) : this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("9c903190", new Object[]{this, str, new Long(j), new Long(j2)}) : this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(String str, long j, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("655244f9", new Object[]{this, str, new Long(j), str2, map}) : this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(String str, long j, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("b2799d2f", new Object[]{this, str, new Long(j), map}) : this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("5d552b4", new Object[]{this, str, obj}) : this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("dd49e059", new Object[]{this, str, str2, map}) : this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("1473508f", new Object[]{this, str, map}) : this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("25915716", new Object[]{this, new Boolean(z)}) : this;
    }

    @Override // com.taobao.monitor.procedure.g
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "no-session";
    }

    @Override // com.taobao.monitor.procedure.g
    public g b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("c8b1d6f9", new Object[]{this}) : this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g b(String str, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("8021a231", new Object[]{this, str, new Long(j)}) : this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("88200793", new Object[]{this, str, obj}) : this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("5c4e010", new Object[]{this, str, map}) : this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g c(String str, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("a975f772", new Object[]{this, str, new Long(j)}) : this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("a6abc72", new Object[]{this, str, obj}) : this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g c(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("f7166f91", new Object[]{this, str, map}) : this;
    }

    @Override // com.taobao.monitor.procedure.g
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.monitor.procedure.g
    public g d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("b13047b7", new Object[]{this}) : this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g d(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("e867ff12", new Object[]{this, str, map}) : this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g e(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("d9b98e93", new Object[]{this, str, map}) : this;
    }
}
