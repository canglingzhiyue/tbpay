package tb;

import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import mtopsdk.common.util.StringUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.j;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes5.dex */
public class fnj extends fpo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1972305648);
    }

    public static /* synthetic */ Object ipc$super(fnj fnjVar, String str, Object... objArr) {
        if (str.hashCode() == 196300992) {
            super.a((View) objArr[0], (fpd) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fpo
    public void a(View view, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb350c0", new Object[]{this, view, fpdVar});
            return;
        }
        super.a(view, fpdVar);
        b(view, fpdVar);
    }

    public void b(final View view, final fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e3909f", new Object[]{this, view, fpdVar});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setFocusable(true);
            viewGroup.setFocusableInTouchMode(true);
        }
        final fpq fpqVar = (fpq) view.getTag(j.PROPERTY_KEY);
        if (fpqVar == null) {
            return;
        }
        final Map<String, String> map = fpqVar.d;
        if (map.isEmpty()) {
            return;
        }
        if (view.isFocusable()) {
            if (map.containsKey("onChange")) {
                a aVar = (a) view.getTag(j.TEXT_WATCHER);
                if (aVar != null) {
                    ((EditText) view).removeTextChangedListener(aVar);
                }
                a aVar2 = new a(view, fpqVar);
                aVar2.a(fpdVar);
                view.setTag(j.TEXT_WATCHER, aVar2);
                ((EditText) view).addTextChangedListener(aVar2);
            }
            if (!map.containsKey("onFinish") && !map.containsKey("onBegin")) {
                return;
            }
            view.setOnTouchListener(new View.OnTouchListener() { // from class: tb.fnj.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view2, motionEvent})).booleanValue();
                    }
                    if (motionEvent.getActionMasked() == 1 && ((b) view.getTag(j.KEY_BOARD_LISTENER)) == null) {
                        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                        if (map.containsKey("onBegin")) {
                            String str = (String) map.get("onBegin");
                            if (!StringUtils.isEmpty(str)) {
                                ArrayList arrayList = new ArrayList(5);
                                arrayList.add(((EditText) view).getText());
                                view.setTag(j.VIEW_PARAMS, arrayList);
                                fpo.b(view, fpdVar, fpqVar, str);
                            }
                        }
                        b bVar = new b(view, fpqVar);
                        bVar.a(fpdVar);
                        view.getViewTreeObserver().addOnGlobalLayoutListener(bVar);
                        view.setTag(j.KEY_BOARD_LISTENER, bVar);
                    }
                    return false;
                }
            });
            return;
        }
        view.setOnTouchListener(null);
        a aVar3 = (a) view.getTag(j.TEXT_WATCHER);
        if (aVar3 != null) {
            ((EditText) view).removeTextChangedListener(aVar3);
        }
        view.setOnFocusChangeListener(null);
    }

    /* loaded from: classes5.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private fpd b;
        private fpq c;
        private String d;
        private View e;
        private boolean f;

        static {
            kge.a(437355247);
            kge.a(300785761);
        }

        public static /* synthetic */ boolean a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39320dfc", new Object[]{bVar})).booleanValue() : bVar.f;
        }

        public static /* synthetic */ void b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("930d7839", new Object[]{bVar});
            } else {
                bVar.a();
            }
        }

        public b(View view, fpq fpqVar) {
            this.c = fpqVar;
            this.e = view;
            Map<String, String> map = fpqVar.d;
            if (!map.isEmpty()) {
                this.d = map.get("onFinish");
            }
        }

        public void a(fpd fpdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8fbfbbe", new Object[]{this, fpdVar});
                return;
            }
            this.b = fpdVar;
            this.e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: tb.fnj.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(View view, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                    } else if (z || b.a(b.this)) {
                    } else {
                        b.b(b.this);
                    }
                }
            });
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            Rect rect = new Rect();
            View rootView = this.e.getRootView();
            rootView.getWindowVisibleDisplayFrame(rect);
            int height = rootView.getHeight();
            if (height - rect.bottom > height / 3) {
                z = true;
            }
            if (z) {
                return;
            }
            a();
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            if (!StringUtils.isEmpty(this.d)) {
                ArrayList arrayList = new ArrayList(5);
                arrayList.add(((EditText) this.e).getText());
                this.e.setTag(j.VIEW_PARAMS, arrayList);
                fpo.b(this.e, this.b, this.c, this.d);
            }
            if (Build.VERSION.SDK_INT >= 16) {
                this.e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.e.setTag(j.KEY_BOARD_LISTENER, null);
            } else {
                this.e.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                this.e.setTag(j.KEY_BOARD_LISTENER, null);
            }
            this.f = true;
        }
    }

    /* loaded from: classes5.dex */
    public class a implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private fpd b;
        private fpq c;
        private String d;
        private String e;
        private View f;

        static {
            kge.a(1800510169);
            kge.a(1670231405);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        public a(View view, fpq fpqVar) {
            this.c = fpqVar;
            this.f = view;
            Map<String, String> map = fpqVar.d;
            if (!map.isEmpty()) {
                this.d = map.get("onChange");
                this.e = map.get("onBegin");
            }
        }

        public void a(fpd fpdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8fbfbbe", new Object[]{this, fpdVar});
            } else {
                this.b = fpdVar;
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            } else if (StringUtils.isEmpty(this.d)) {
            } else {
                ArrayList arrayList = new ArrayList(5);
                arrayList.add(((EditText) this.f).getText());
                this.f.setTag(j.VIEW_PARAMS, arrayList);
                fpo.b(this.f, this.b, this.c, this.d);
            }
        }
    }
}
