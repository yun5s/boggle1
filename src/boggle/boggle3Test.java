package boggle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class boggle3Test {
	String word;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
			word = "EEAE";
			char[][] board = {
		            {'E','L','E','W'},
		            {'B','E','G','E'},
		            {'I','U','A','O'}, 
		            {'A','T','T','L'}
		            };
		            
	  	  	assertEquals(true, boggle3.valid(board,word));
		        }
	@Test
	public void testLargerBoard(){

	//case bigger array && longger string
		word = "GURSALEYLAUASR";
		char[][] board = {
            {'I','T','B','L','A','W'},
            {'P','G','U','E','Q','W'},
            {'S','T','R','S','A','L'},  
            {'B','N','G','L','I','E'},
            {'I','U','A','O','Y','U'}, 
            {'A','S','R','L','U','I'}
            };
		assertEquals(true, boggle3.valid(board,word));

	}

	@Test
	//tall board
	public void testTallBoard(){

		word = "INARS";
		char[][] board = {
            {'I','L','A','W'},
            {'B','N','G','E'},
            {'I','U','A','O'}, 
            {'A','S','R','L'},
            };
		assertEquals(true, boggle3.valid(board,word));

	}

	@Test
	//adjacent string is across the board

	public void testWrongAns(){

		word = "NBEG";
		char[][] board = {
            {'I','L','A','W'},
            {'B','N','G','E'},
            {'I','U','A','O'}, 
            {'A','S','R','L'}
            };
		assertEquals(false, boggle3.valid(board,word));

		}
	}

