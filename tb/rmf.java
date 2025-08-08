package tb;

import android.graphics.drawable.ColorDrawable;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.ListView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.extension.UCExtension;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rmf extends rmj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1428473021);
    }

    public static /* synthetic */ Object ipc$super(rmf rmfVar, String str, Object... objArr) {
        if (str.hashCode() == -326148900) {
            super.a((View) objArr[0], (HashMap) objArr[1], (rlw) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.rmj, tb.rmg
    public void a(Object obj, String str, String str2, rlw rlwVar, String str3) {
        ListView listView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605ad635", new Object[]{this, obj, str, str2, rlwVar, str3});
        } else if (!(obj instanceof ListView) || (listView = (ListView) obj) == null) {
        } else {
            String str4 = rlz.a().g(str3).get(str2);
            if (!StringUtils.isEmpty(str4)) {
                str2 = str4;
            }
            HashMap<String, Object> hashMap = rlz.a().d(str, str3).get(str2);
            if (hashMap == null || hashMap.size() == 0) {
                return;
            }
            a(listView, hashMap, rlwVar);
        }
    }

    @Override // tb.rmj, tb.rmg
    public void a(Object obj, HashMap<String, Object> hashMap, rlw rlwVar) {
        ListView listView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dedfb5c2", new Object[]{this, obj, hashMap, rlwVar});
        } else if (!(obj instanceof ListView) || (listView = (ListView) obj) == null || hashMap == null || hashMap.size() == 0) {
        } else {
            a(listView, hashMap, rlwVar);
        }
    }

    public void a(ListView listView, HashMap<String, Object> hashMap, rlw rlwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f06b95b", new Object[]{this, listView, hashMap, rlwVar});
        } else if (listView != null && hashMap != null && hashMap.size() != 0) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                String valueOf = String.valueOf(entry.getKey());
                if (!StringUtils.isEmpty(valueOf)) {
                    Object value = entry.getValue();
                    try {
                        switch (rlp.a(valueOf)) {
                            case rlp.T_CACHE_COLOR_HINT /* 10452 */:
                                listView.setCacheColorHint(rmm.a(String.valueOf(value)));
                                break;
                            case rlp.T_DIVIDER_HEIGHT /* 10453 */:
                                listView.setDividerHeight(Integer.parseInt(value.toString()));
                                break;
                            case rlp.T_FADING_EDGE /* 10455 */:
                                a(listView, Integer.parseInt(value.toString()));
                                break;
                            case rlp.T_SCROLL_BARS /* 10456 */:
                                b(listView, Integer.parseInt(value.toString()));
                                break;
                            case rlp.T_FAST_SCROLL_ENABLED /* 10457 */:
                                listView.setFastScrollEnabled(((Boolean) value).booleanValue());
                                break;
                            case rlp.T_SCROLL_BAR_STYLE /* 10458 */:
                                c(listView, Integer.parseInt(value.toString()));
                                break;
                            case rlp.T_STACK_FROM_BOTTOM /* 10459 */:
                                listView.setStackFromBottom(((Boolean) value).booleanValue());
                                break;
                            case rlp.T_FADE_SCROLL_BARS /* 10460 */:
                                listView.setScrollbarFadingEnabled(((Boolean) value).booleanValue());
                                break;
                            case rlp.T_SCROLLING_CACHE /* 10461 */:
                                listView.setScrollingCacheEnabled(((Boolean) value).booleanValue());
                                break;
                            case rlp.T_LIST_SELECTOR /* 10462 */:
                                listView.setSelector(new ColorDrawable(rmm.a(String.valueOf(value))));
                                break;
                        }
                    } catch (Throwable th) {
                        rmn.a(th);
                    }
                }
            }
            super.a((View) listView, hashMap, (rlw) null);
        }
    }

    private void a(ListView listView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd117a18", new Object[]{this, listView, new Integer(i)});
        } else if (i == 1) {
            listView.setHorizontalFadingEdgeEnabled(false);
            listView.setVerticalFadingEdgeEnabled(true);
        } else if (i == 2) {
            listView.setHorizontalFadingEdgeEnabled(true);
            listView.setVerticalFadingEdgeEnabled(false);
        } else if (i == 3) {
            listView.setHorizontalFadingEdgeEnabled(true);
            listView.setVerticalFadingEdgeEnabled(true);
        } else {
            listView.setHorizontalFadingEdgeEnabled(false);
            listView.setVerticalFadingEdgeEnabled(false);
        }
    }

    private void b(ListView listView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1fa4259", new Object[]{this, listView, new Integer(i)});
        } else if (i == 1) {
            listView.setHorizontalScrollBarEnabled(false);
            listView.setVerticalScrollBarEnabled(true);
        } else if (i == 2) {
            listView.setHorizontalScrollBarEnabled(true);
            listView.setVerticalScrollBarEnabled(false);
        } else {
            listView.setHorizontalScrollBarEnabled(false);
            listView.setVerticalScrollBarEnabled(false);
        }
    }

    private void c(ListView listView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6e30a9a", new Object[]{this, listView, new Integer(i)});
        } else if (i == 1) {
            listView.setScrollBarStyle(16777216);
        } else if (i == 2) {
            listView.setScrollBarStyle(UCExtension.EXTEND_INPUT_TYPE_IDCARD);
        } else if (i == 3) {
            listView.setScrollBarStyle(50331648);
        } else {
            listView.setScrollBarStyle(0);
        }
    }
}
