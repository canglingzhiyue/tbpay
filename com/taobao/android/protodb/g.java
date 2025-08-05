package com.taobao.android.protodb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class g extends LSDB {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f14708a;

    @Override // com.taobao.android.protodb.LSDB
    public boolean close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e32ba683", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean forceCompact(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75df98a8", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.protodb.LSDB
    public byte[] getBinary(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("76abe199", new Object[]{this, eVar});
        }
        return null;
    }

    @Override // com.taobao.android.protodb.LSDB
    public int getDataSize(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cf2b281", new Object[]{this, eVar})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean insertBinary(e eVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ef3f332", new Object[]{this, eVar, bArr})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.protodb.LSDB
    public d<e> keyIterator(e eVar, e eVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("1a70377d", new Object[]{this, eVar, eVar2});
        }
        return null;
    }

    public g(Context context) {
        super(0L, "", 0);
        this.f14708a = context.getSharedPreferences("lsdb", 0);
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean contains(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("932394f0", new Object[]{this, eVar})).booleanValue() : this.f14708a.contains(eVar.a());
    }

    @Override // com.taobao.android.protodb.LSDB
    public d<e> keyIterator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("35837809", new Object[]{this}) : new f((String[]) this.f14708a.getAll().keySet().toArray(new String[0]));
    }

    @Override // com.taobao.android.protodb.LSDB
    public String getString(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7d16af4c", new Object[]{this, eVar}) : this.f14708a.getString(eVar.a(), "");
    }

    @Override // com.taobao.android.protodb.LSDB
    public int getInt(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bfad40f9", new Object[]{this, eVar})).intValue() : this.f14708a.getInt(eVar.a(), 0);
    }

    @Override // com.taobao.android.protodb.LSDB
    public long getLong(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e9f058f3", new Object[]{this, eVar})).longValue() : this.f14708a.getLong(eVar.a(), 0L);
    }

    @Override // com.taobao.android.protodb.LSDB
    public float getFloat(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("431c85a3", new Object[]{this, eVar})).floatValue() : this.f14708a.getFloat(eVar.a(), 0.0f);
    }

    @Override // com.taobao.android.protodb.LSDB
    public double getDouble(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eef89382", new Object[]{this, eVar})).doubleValue() : getFloat(eVar);
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean getBool(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("933131f1", new Object[]{this, eVar})).booleanValue() : this.f14708a.getBoolean(eVar.a(), false);
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean insertString(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9476645", new Object[]{this, eVar, str})).booleanValue();
        }
        this.f14708a.edit().putString(eVar.a(), str).apply();
        return true;
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean insertInt(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50cbe3e4", new Object[]{this, eVar, new Integer(i)})).booleanValue();
        }
        this.f14708a.edit().putInt(eVar.a(), i).apply();
        return true;
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean insertLong(e eVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("935cd0e6", new Object[]{this, eVar, new Long(j)})).booleanValue();
        }
        this.f14708a.edit().putLong(eVar.a(), j).apply();
        return true;
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean insertFloat(e eVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9656cd4", new Object[]{this, eVar, new Float(f)})).booleanValue();
        }
        this.f14708a.edit().putFloat(eVar.a(), f).apply();
        return true;
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean insertDouble(e eVar, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6543f72b", new Object[]{this, eVar, new Double(d)})).booleanValue();
        }
        this.f14708a.edit().putFloat(eVar.a(), (float) d).apply();
        return true;
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean insertBool(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("123751c8", new Object[]{this, eVar, new Boolean(z)})).booleanValue();
        }
        this.f14708a.edit().putBoolean(eVar.a(), z).apply();
        return true;
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean delete(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88e1c17c", new Object[]{this, eVar})).booleanValue();
        }
        this.f14708a.edit().remove(eVar.a()).apply();
        return true;
    }
}
