package sepm.ss15.e1227085.test;

import org.junit.After;
import org.junit.Before;
import sepm.ss15.e1227085.dao.DataSource;
import sepm.ss15.e1227085.dao.IRaceDAO;
import sepm.ss15.e1227085.dao.impl.JDBCRaceDAO;

import java.sql.SQLException;


/**
 * Created by Patrick Grosslicht <e1227085@student.tuwien.ac.at>.
 */
public class JDBCRaceDAOTest extends AbstractJDBCRaceDAOTest {
    private DataSource dataSource;

    @Before
    public void setUp() throws SQLException {
        IRaceDAO raceDAO = new JDBCRaceDAO();
        setJDBCRaceDAO(raceDAO);
        dataSource.getConnection().setAutoCommit(false);
    }

    @After
    public void tearDown() throws SQLException {
        dataSource.getConnection().rollback();
    }
}
