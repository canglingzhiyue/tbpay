package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes7.dex */
public class klv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public kly f30151a;
    public kmr b;
    public URL c;
    public File d;
    public File e;
    public File[] f;

    public klv(kmr kmrVar) {
        this.b = kmrVar;
        this.f30151a = new kly(kmrVar);
    }

    public void a() throws MalformedURLException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.c != null) {
        } else {
            this.c = new URL(this.b.e.f30167a);
            this.e = new File(this.b.g, TextUtils.isEmpty(this.b.e.d) ? new File(this.c.getFile()).getName() : this.b.e.d);
            this.d = new File(this.b.g, kna.b(this.b.e.f30167a));
            if (!this.d.getParentFile().exists()) {
                this.d.getParentFile().mkdirs();
            }
            if (!this.d.getParentFile().canWrite()) {
                this.d.getParentFile().setWritable(true);
            }
            if (this.b.f.s || !TextUtils.isEmpty(this.b.e.c)) {
                return;
            }
            this.e.delete();
            this.d.delete();
        }
    }

    public File a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("c26a5a1b", new Object[]{this, str});
        }
        String str2 = this.b.g;
        File file = new File(str2, kna.b(this.b.e.f30167a + str));
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (!file.getParentFile().canWrite()) {
            file.getParentFile().setWritable(true);
        }
        return file;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.e.exists() && (0 == this.b.e.b || this.b.e.b == this.e.length()) && kna.a(this.b.e.c, this.e.getAbsolutePath());
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : (0 != this.b.e.b || !TextUtils.isEmpty(this.b.e.c)) && this.d.exists() && (0 == this.b.e.b || this.b.e.b == this.d.length()) && kna.a(this.b.e.c, this.d.getAbsolutePath());
    }

    public Pair<Boolean, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("bbe3e075", new Object[]{this});
        }
        if (0 == this.b.e.b && TextUtils.isEmpty(this.b.e.c)) {
            if (!this.b.f.j) {
                return new Pair<>(true, "");
            }
            return new Pair<>(false, "");
        } else if (this.d.exists() && (0 == this.b.e.b || this.b.e.b == this.d.length())) {
            if (TextUtils.isEmpty(this.b.e.c)) {
                return new Pair<>(true, "");
            }
            if (TextUtils.isEmpty(this.d.getAbsolutePath())) {
                return new Pair<>(false, "");
            }
            String a2 = kna.a(this.d.getAbsolutePath());
            boolean equals = this.b.e.c.toLowerCase().equals(a2);
            kmv.d("Downloader.InputContext", "checkPartFileValid taskMd5 =  " + this.b.e.c + ", fileMd5 = " + a2 + ", md5Same = " + equals, new Object[0]);
            return new Pair<>(Boolean.valueOf(equals), a2);
        } else {
            return new Pair<>(false, "");
        }
    }

    public long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue();
        }
        if (!this.d.exists()) {
            return 0L;
        }
        long length = this.d.length();
        if (0 == this.b.e.b || length < this.b.e.b) {
            return length;
        }
        this.d.delete();
        return 0L;
    }

    public long a(File file, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c85cd2b9", new Object[]{this, file, new Long(j)})).longValue();
        }
        if (file != null && file.exists()) {
            long length = file.length();
            if (length <= j) {
                return length;
            }
            file.delete();
        }
        return 0L;
    }

    public RandomAccessFile f() throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RandomAccessFile) ipChange.ipc$dispatch("11686f9", new Object[]{this}) : a(this.d);
    }

    public RandomAccessFile a(File file) throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RandomAccessFile) ipChange.ipc$dispatch("3680fd47", new Object[]{this, file}) : new RandomAccessFile(file, "rw");
    }

    public boolean a(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c11c72b", new Object[]{this, new Long(j), new Integer(i)})).booleanValue();
        }
        if (200 != i && 206 != i) {
            return false;
        }
        if (j > 0) {
            if (206 == i) {
                j += this.d.length();
            } else if (200 != i) {
                j = 0;
            }
            if (j != 0 && this.b.e.b != 0 && j != this.b.e.b) {
                return false;
            }
            if (0 == this.b.e.b) {
                this.b.e.b = j;
            }
        }
        return true;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        if (0 != this.b.e.b && this.b.e.b != this.d.length()) {
            return -18;
        }
        return !kna.a(this.b.e.c, this.d.getAbsolutePath()) ? -15 : -14;
    }
}
