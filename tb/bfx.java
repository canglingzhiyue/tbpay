package tb;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public final class bfx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ClassLoader classLoader;

    static {
        kge.a(46088835);
        classLoader = bfx.class.getClassLoader();
    }

    private bfx() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("8ca01dc9", new Object[]{parcel, creator});
        }
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void a(Parcel parcel, Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50d669ae", new Object[]{parcel, parcelable});
        } else if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
    }
}
