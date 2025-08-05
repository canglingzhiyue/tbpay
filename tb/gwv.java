package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;

/* loaded from: classes5.dex */
public class gwv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1182005441);
    }

    public static boolean a(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c849b06a", new Object[]{iUGCMedia})).booleanValue();
        }
        if (iUGCMedia == null) {
            return true;
        }
        return !b(iUGCMedia) && !c(iUGCMedia);
    }

    public static boolean b(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("edddb96b", new Object[]{iUGCMedia})).booleanValue() : (iUGCMedia == null || iUGCMedia.getImages() == null || iUGCMedia.getImages().size() <= 0) ? false : true;
    }

    public static boolean c(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1371c26c", new Object[]{iUGCMedia})).booleanValue() : (iUGCMedia == null || iUGCMedia.getVideos() == null || iUGCMedia.getVideos().size() <= 0) ? false : true;
    }

    public static boolean d(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3905cb6d", new Object[]{iUGCMedia})).booleanValue() : b(iUGCMedia) && !c(iUGCMedia);
    }

    public static boolean e(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5e99d46e", new Object[]{iUGCMedia})).booleanValue() : c(iUGCMedia) && !b(iUGCMedia);
    }
}
