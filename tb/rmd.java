package tb;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rmd extends rmj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1079199758);
    }

    public static /* synthetic */ Object ipc$super(rmd rmdVar, String str, Object... objArr) {
        if (str.hashCode() == -326148900) {
            super.a((View) objArr[0], (HashMap) objArr[1], (rlw) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.rmj, tb.rmg
    public void a(Object obj, String str, String str2, rlw rlwVar, String str3) {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605ad635", new Object[]{this, obj, str, str2, rlwVar, str3});
        } else if (!(obj instanceof ImageView) || (imageView = (ImageView) obj) == null) {
        } else {
            String str4 = rlz.a().g(str3).get(str2);
            if (!TextUtils.isEmpty(str4)) {
                str2 = str4;
            }
            HashMap<String, Object> hashMap = rlz.a().d(str, str3).get(str2);
            if (hashMap == null || hashMap.size() == 0) {
                return;
            }
            a(imageView, hashMap, rlwVar);
        }
    }

    public void a(ImageView imageView, HashMap<String, Object> hashMap, rlw rlwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb398724", new Object[]{this, imageView, hashMap, rlwVar});
        } else if (imageView != null && hashMap != null && hashMap.size() != 0) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                String valueOf = String.valueOf(entry.getKey());
                if (TextUtils.isEmpty(valueOf)) {
                    return;
                }
                Object value = entry.getValue();
                try {
                } catch (Throwable th) {
                    rmn.a(th);
                }
                switch (rlp.a(valueOf)) {
                    case rlp.T_ADJUST_VIEW_BOUNDS /* 10202 */:
                        imageView.setAdjustViewBounds(Boolean.parseBoolean(value.toString()));
                        continue;
                    case rlp.T_MAX_HEIGHT /* 10203 */:
                        imageView.setMaxHeight(rmm.f(value.toString()));
                        continue;
                    case rlp.T_MAX_WIDTH /* 10204 */:
                        imageView.setMaxWidth(rmm.f(value.toString()));
                        continue;
                    case rlp.T_SCALE_TYPE /* 10205 */:
                        a(imageView, Integer.parseInt(value.toString()));
                        continue;
                    case rlp.T_IMAGE_SOURCE /* 10206 */:
                    case rlp.T_IMAGE /* 10207 */:
                        String obj = value.toString();
                        if (!obj.startsWith("#") && !obj.startsWith(rmm.COLOR_RESOURCE)) {
                            if (obj.startsWith(rmm.DRAWABLE_RESOURCE)) {
                                imageView.setImageDrawable(rmm.d(obj));
                            } else if (rlz.a().c() != null) {
                                rlz.a();
                            }
                        }
                        imageView.setImageDrawable(new ColorDrawable(rmm.a(obj)));
                        continue;
                        break;
                    case rlp.T_TINT /* 10208 */:
                        imageView.setColorFilter(rmm.a(value.toString()));
                        continue;
                    case rlp.T_CONTENT_DESCRIPTION /* 10209 */:
                        imageView.setContentDescription(value.toString());
                        continue;
                    default:
                        continue;
                }
                rmn.a(th);
            }
            super.a((View) imageView, hashMap, (rlw) null);
        }
    }

    @Override // tb.rmj, tb.rmg
    public void a(Object obj, HashMap<String, Object> hashMap, rlw rlwVar) {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dedfb5c2", new Object[]{this, obj, hashMap, rlwVar});
        } else if (!(obj instanceof ImageView) || (imageView = (ImageView) obj) == null || hashMap == null || hashMap.size() == 0) {
        } else {
            a(imageView, hashMap, rlwVar);
        }
    }

    private void a(ImageView imageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017121", new Object[]{this, imageView, new Integer(i)});
        } else if (i < 0) {
        } else {
            switch (i) {
                case 1:
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    return;
                case 2:
                    imageView.setScaleType(ImageView.ScaleType.FIT_START);
                    return;
                case 3:
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    return;
                case 4:
                    imageView.setScaleType(ImageView.ScaleType.FIT_END);
                    return;
                case 5:
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    return;
                case 6:
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    return;
                default:
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    return;
            }
        }
    }
}
