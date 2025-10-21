namespace AiSD2110
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        void SC(List<int>T, int l, int p)
        {
            if (l < p)
            {
                int s = (l - p) / 2;
                SC(T, l, s);
                SC(T, s + l, p);
                SCAL(T, l, s, p);
            }
        }

        private void SCAL(List<int>t, int l, int s, int p)
        {
            
        }

        private void button1_Click(object sender, EventArgs e)
        {
            var T = new List<int>() {3, 27, 38, 43, 9, 10, 82};
            SCAL(T, 0, 3, T.Count - 1);
        }
    }
}
