package com.huawei.hms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;

/* loaded from: classes4.dex */
public class HMSCursorWrapper extends CursorWrapper implements CrossProcessCursor {

    /* renamed from: a  reason: collision with root package name */
    private AbstractWindowedCursor f7406a;

    public HMSCursorWrapper(Cursor cursor) {
        super(cursor);
        if (cursor != null) {
            if (!(cursor instanceof CursorWrapper)) {
                throw new IllegalArgumentException("cursor:" + cursor + " is not a subclass for CursorWrapper");
            }
            Cursor wrappedCursor = ((CursorWrapper) cursor).getWrappedCursor();
            if (wrappedCursor == null) {
                throw new IllegalArgumentException("getWrappedCursor cannot be null");
            }
            if (wrappedCursor instanceof AbstractWindowedCursor) {
                this.f7406a = (AbstractWindowedCursor) wrappedCursor;
                return;
            }
            throw new IllegalArgumentException("getWrappedCursor:" + wrappedCursor + " is not a subclass for CursorWrapper");
        }
        throw new IllegalArgumentException("cursor cannot be null");
    }

    @Override // android.database.CrossProcessCursor
    public void fillWindow(int i, CursorWindow cursorWindow) {
        this.f7406a.fillWindow(i, cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    public CursorWindow getWindow() {
        return this.f7406a.getWindow();
    }

    @Override // android.database.CursorWrapper
    public Cursor getWrappedCursor() {
        return this.f7406a;
    }

    @Override // android.database.CrossProcessCursor
    public boolean onMove(int i, int i2) {
        return this.f7406a.onMove(i, i2);
    }

    public void setWindow(CursorWindow cursorWindow) {
        this.f7406a.setWindow(cursorWindow);
    }
}
