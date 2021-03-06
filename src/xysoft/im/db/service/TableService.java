package xysoft.im.db.service;

import xysoft.im.db.dao.TableDao;
import org.apache.ibatis.session.SqlSession;


public class TableService
{
    private TableDao dao;

    public TableService(SqlSession session)
    {
        dao = new TableDao(session);
    }

    public void createCurrentUserTable()
    {
        dao.createCurrentUserTable();
    }

    public boolean exist(String name)
    {
        return dao.exist(name);
    }

    public void createRoomTable()
    {
        dao.createRoomTable();
    }

    public void createMessageTable()
    {
        dao.createMessageTable();
    }

    public void createFileAttachmentTable()
    {
        dao.createFileAttachmentTable();
    }

    public void createImageAttachmentTable()
    {
        dao.createImageAttachmentTable();
    }

    public void createContactsUserTable()
    {
        dao.createContactsUserTable();
    }
}
