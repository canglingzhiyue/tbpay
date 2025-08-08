package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* loaded from: classes.dex */
public class len extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_RDISPATCHSLIDERAPPEAREVENT = 4903107558643966586L;
    public static final int KEY_DELAY_TIME = 3;
    public static final int KEY_LENGTH = 0;
    public static final int KEY_MAX_DELAY_TIME = 4;
    public static final int KEY_POINT_INDEX = 2;
    public static final int KEY_USER_ID = 1;

    static {
        kge.a(1128361161);
    }

    public static /* synthetic */ Object ipc$super(len lenVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(len lenVar, DXRuntimeContext dXRuntimeContext, DXPageChangeEvent dXPageChangeEvent, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b71d84", new Object[]{lenVar, dXRuntimeContext, dXPageChangeEvent, str, new Integer(i)});
        } else {
            lenVar.a(dXRuntimeContext, dXPageChangeEvent, str, i);
        }
    }

    public static /* synthetic */ void a(len lenVar, DXRuntimeContext dXRuntimeContext, DXPageChangeEvent dXPageChangeEvent, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a12d05ff", new Object[]{lenVar, dXRuntimeContext, dXPageChangeEvent, str, new Integer(i), new Integer(i2)});
        } else {
            lenVar.b(dXRuntimeContext, dXPageChangeEvent, str, i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int parseInt;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length < 5) {
        } else {
            if (objArr[0] instanceof Integer) {
                i = ((Integer) objArr[0]).intValue();
            } else if (objArr[0] instanceof String) {
                try {
                    i = Integer.parseInt((String) objArr[0]);
                } catch (NumberFormatException e) {
                    ldf.a("DispatchSliderAppearEvent", "parse int error", e);
                }
            } else {
                i = -1;
            }
            String str = objArr[1] instanceof String ? (String) objArr[1] : null;
            if (i == -1 || StringUtils.isEmpty(str)) {
                return;
            }
            if (objArr[2] instanceof Integer) {
                parseInt = ((Integer) objArr[2]).intValue();
            } else {
                if (objArr[2] instanceof String) {
                    try {
                        parseInt = Integer.parseInt((String) objArr[2]);
                    } catch (NumberFormatException e2) {
                        ldf.a("DispatchSliderAppearEvent", "parse int error", e2);
                    }
                }
                parseInt = -1;
            }
            if (!(dXEvent instanceof DXPageChangeEvent)) {
                return;
            }
            DXPageChangeEvent dXPageChangeEvent = (DXPageChangeEvent) dXEvent;
            int a2 = a(dXRuntimeContext);
            Object obj = objArr[3];
            Object obj2 = objArr[4];
            if (-1 != parseInt) {
                a(dXRuntimeContext, dXPageChangeEvent, str, parseInt, a2, a(dXRuntimeContext, obj, obj2));
            } else {
                a(dXRuntimeContext, dXPageChangeEvent, str, a2, a(dXRuntimeContext, obj, obj2));
            }
            a(dXRuntimeContext, dXPageChangeEvent.pageIndex);
        }
    }

    private void a(final DXRuntimeContext dXRuntimeContext, final DXPageChangeEvent dXPageChangeEvent, final String str, final int i, final int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed256ff", new Object[]{this, dXRuntimeContext, dXPageChangeEvent, str, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (i3 != 0) {
            dXRuntimeContext.s().postDelayed(new Runnable() { // from class: tb.len.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        len.a(len.this, dXRuntimeContext, dXPageChangeEvent, str, i, i2);
                    }
                }
            }, i3);
        } else {
            b(dXRuntimeContext, dXPageChangeEvent, str, i, i2);
        }
    }

    private void a(final DXRuntimeContext dXRuntimeContext, final DXPageChangeEvent dXPageChangeEvent, final String str, final int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5a3ac84", new Object[]{this, dXRuntimeContext, dXPageChangeEvent, str, new Integer(i), new Integer(i2)});
        } else if (i2 != 0) {
            dXRuntimeContext.s().postDelayed(new Runnable() { // from class: tb.len.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        len.a(len.this, dXRuntimeContext, dXPageChangeEvent, str, i);
                    }
                }
            }, i2);
        } else {
            a(dXRuntimeContext, dXPageChangeEvent, str, i);
        }
    }

    private void b(DXRuntimeContext dXRuntimeContext, DXPageChangeEvent dXPageChangeEvent, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f54d7c5", new Object[]{this, dXRuntimeContext, dXPageChangeEvent, str, new Integer(i), new Integer(i2)});
            return;
        }
        if (dXPageChangeEvent.pageIndex == i) {
            a(dXRuntimeContext, a(str, i));
        }
        if (i2 != i) {
            return;
        }
        b(dXRuntimeContext, a(str, i2));
    }

    private void a(DXRuntimeContext dXRuntimeContext, DXPageChangeEvent dXPageChangeEvent, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("823f125f", new Object[]{this, dXRuntimeContext, dXPageChangeEvent, str, new Integer(i)});
            return;
        }
        a(dXRuntimeContext, a(str, dXPageChangeEvent.pageIndex), true);
        a(dXRuntimeContext, a(str, i), false);
    }

    private void a(DXRuntimeContext dXRuntimeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d039b63", new Object[]{this, dXRuntimeContext, str});
        } else {
            a(dXRuntimeContext, str, true);
        }
    }

    private void b(DXRuntimeContext dXRuntimeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e552ae4", new Object[]{this, dXRuntimeContext, str});
        } else {
            a(dXRuntimeContext, str, false);
        }
    }

    private void a(DXRuntimeContext dXRuntimeContext, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("637083d1", new Object[]{this, dXRuntimeContext, str, new Boolean(z)});
            return;
        }
        DXWidgetNode queryWidgetNodeByUserId = dXRuntimeContext.d().queryWidgetNodeByUserId(str);
        if (queryWidgetNodeByUserId == null) {
            return;
        }
        queryWidgetNodeByUserId.postEvent(z ? new DXPageChangeEvent(5288671110273408574L) : new DXPageChangeEvent(5388973340095122049L));
    }

    private String a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75f5ebaf", new Object[]{this, str, new Integer(i)});
        }
        return str + i;
    }

    private void a(DXRuntimeContext dXRuntimeContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c71e584a", new Object[]{this, dXRuntimeContext, new Integer(i)});
            return;
        }
        JSONObject e = dXRuntimeContext.e();
        if (e == null) {
            return;
        }
        e.put("_slide_last_index", (Object) Integer.valueOf(i));
    }

    private int a(DXRuntimeContext dXRuntimeContext) {
        Integer integer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("487cd5cc", new Object[]{this, dXRuntimeContext})).intValue();
        }
        JSONObject e = dXRuntimeContext.e();
        if (e != null && (integer = e.getInteger("_slide_last_index")) != null) {
            return integer.intValue();
        }
        return -1;
    }

    private int a(DXRuntimeContext dXRuntimeContext, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("962ebe04", new Object[]{this, dXRuntimeContext, obj, obj2})).intValue();
        }
        if (obj == null) {
            return 0;
        }
        try {
            int parseInt = Integer.parseInt((String) obj);
            int parseInt2 = obj2 == null ? 0 : Integer.parseInt((String) obj2);
            JSONObject e = dXRuntimeContext.e();
            if (e == null) {
                return 0;
            }
            if (!e.getBooleanValue("_slide_is_first_load")) {
                parseInt = Math.max(parseInt, parseInt2);
            }
            i = parseInt;
            e.put("_slide_is_first_load", (Object) true);
            return i;
        } catch (Throwable th) {
            ldf.a("DXDispatchSliderAppearEvent", "getDelayTime error", th);
            return i;
        }
    }
}
