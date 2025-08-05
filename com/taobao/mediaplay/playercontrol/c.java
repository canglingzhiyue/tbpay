package com.taobao.mediaplay.playercontrol;

import android.app.Activity;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.mjv;

/* loaded from: classes7.dex */
public class c implements Window.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Window.Callback f18060a;
    private Activity c;
    private final Object[] d = new Object[0];
    public CopyOnWriteArrayList<mjv> b = new CopyOnWriteArrayList<>();

    static {
        kge.a(-183667621);
        kge.a(927661743);
    }

    public c(Activity activity) {
        if (activity == null) {
            return;
        }
        this.c = activity;
        this.f18060a = activity.getWindow().getCallback();
        activity.getWindow().setCallback(this);
    }

    public void a(mjv mjvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a189bf", new Object[]{this, mjvVar});
            return;
        }
        CopyOnWriteArrayList<mjv> copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.contains(mjvVar)) {
            return;
        }
        this.b.add(0, mjvVar);
    }

    public void b(mjv mjvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3249040", new Object[]{this, mjvVar});
            return;
        }
        CopyOnWriteArrayList<mjv> copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList == null) {
            return;
        }
        copyOnWriteArrayList.remove(mjvVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        KeyEvent keyEvent = new KeyEvent(4, 0);
        Iterator<mjv> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(keyEvent);
        }
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a534d24", new Object[]{this, keyEvent})).booleanValue();
        }
        try {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
                Iterator<mjv> it = this.b.iterator();
                while (it.hasNext()) {
                    if (it.next().a(keyEvent)) {
                        return true;
                    }
                }
            }
            return this.f18060a.dispatchKeyEvent(keyEvent);
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "dispatchKeyEvent error:" + th.toString());
            return false;
        }
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8813208a", new Object[]{this, keyEvent})).booleanValue();
        }
        try {
            return this.f18060a.dispatchKeyShortcutEvent(keyEvent);
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "dispatchKeyShortcutEvent error:" + th.toString());
            return false;
        }
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            return this.f18060a.dispatchTouchEvent(motionEvent);
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "dispatchTouchEvent error:" + th.toString());
            return false;
        }
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6dcf906a", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            return this.f18060a.dispatchTrackballEvent(motionEvent);
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "dispatchTrackballEvent error:" + th.toString());
            return false;
        }
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ab5f9e7", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            return this.f18060a.dispatchGenericMotionEvent(motionEvent);
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "dispatchGenericMotionEvent error:" + th.toString());
            return false;
        }
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbbb6bb7", new Object[]{this, accessibilityEvent})).booleanValue();
        }
        try {
            return this.f18060a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "dispatchPopulateAccessibilityEvent error:" + th.toString());
            return false;
        }
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("4ebc9f90", new Object[]{this, new Integer(i)}) : this.f18060a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d479db08", new Object[]{this, new Integer(i), menu})).booleanValue() : this.f18060a.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("84c1a5ea", new Object[]{this, new Integer(i), view, menu})).booleanValue() : this.f18060a.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("15d437e7", new Object[]{this, new Integer(i), menu})).booleanValue() : this.f18060a.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad41a8b9", new Object[]{this, new Integer(i), menuItem})).booleanValue() : this.f18060a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7edd78b", new Object[]{this, layoutParams});
        } else {
            this.f18060a.onWindowAttributesChanged(layoutParams);
        }
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f48f3b41", new Object[]{this});
        } else {
            this.f18060a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
        } else {
            this.f18060a.onWindowFocusChanged(z);
        }
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
        } else {
            this.f18060a.onAttachedToWindow();
        }
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
        } else {
            this.f18060a.onDetachedFromWindow();
        }
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a08ae12d", new Object[]{this, new Integer(i), menu});
        } else {
            this.f18060a.onPanelClosed(i, menu);
        }
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5fea47d2", new Object[]{this})).booleanValue() : this.f18060a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4dfa1059", new Object[]{this, searchEvent})).booleanValue() : this.f18060a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActionMode) ipChange.ipc$dispatch("bd823506", new Object[]{this, callback}) : this.f18060a.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActionMode) ipChange.ipc$dispatch("8e25ded9", new Object[]{this, callback, new Integer(i)}) : this.f18060a.onWindowStartingActionMode(callback, i);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12f6f8e", new Object[]{this, actionMode});
        } else {
            this.f18060a.onActionModeStarted(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3557b8d", new Object[]{this, actionMode});
        } else {
            this.f18060a.onActionModeFinished(actionMode);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.clear();
        }
    }
}
